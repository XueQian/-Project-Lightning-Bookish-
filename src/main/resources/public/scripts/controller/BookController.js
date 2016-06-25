'use strict';

angular.module('BookishApp')
    .controller('bookController', function ($scope, $routeParams, BookService) {

        BookService.getBooks(function (data) {
            $scope.books = data;
        });

        BookService.getBook($routeParams.id, function (data) {
            $scope.book = data;
        });
    });