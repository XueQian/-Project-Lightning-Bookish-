'use strict';

angular.module('BookishApp')
    .service('BookService', function ($http) {

        this.getBooks = function (callback) {
            $http.get('/books').success(function (books) {
                _(books).forEach(function (book) {
                    formatBookFieldValue(book);
                });
                callback(books);
            });
        };

        this.getBook = function (id, callback) {
            console.log(id);
            $http.get('/books/' + id).success(function (book) {
                formatBookFieldValue(book);
                callback(book);
            });
        };

        function formatBookFieldValue(book) {
            book.author = book.author.replace('["', '').replace('", "', ' & ').replace('"]', '');
            book.isbn = book.isbn.replace('["', '').replace('"]', '');
            book.publishedAt = moment(book.publishedAt).format("DD/MM/YYYY");
        }
    });

