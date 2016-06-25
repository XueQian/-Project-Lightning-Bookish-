'use strict';

angular.module('BookishApp')
    .controller('bookController', function ($scope, BookService) {

        BookService.getBooks(function (data) {
            $scope.books = data;
        });
    });