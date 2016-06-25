'use strict';

angular.module('BookishApp')
    .service('BookService', function ($http) {

        this.getBooks = function (callback) {
            $http.get('/books').success(function (data) {
                _(data).forEach(function (book) {
                    book.author = book.author.replace('["', '').replace('", "', ' & ').replace('"]', '');
                    book.publishedAt = moment(book.publishedAt).format("DD/MM/YYYY");
                });
                callback(data);
            });
        };
    });

