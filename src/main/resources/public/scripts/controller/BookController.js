'use strict';

angular.module('BookishApp')
    .controller('bookController', function ($scope, $routeParams, BookService) {

        getBooks(0);

        $scope.setPage = function (n) {
            $scope.currentPage = n;
            getBooks($scope.currentPage - 1);
        };

        $scope.getTotalPages = function () {
            var pages = [];
            for (var i = 1; i <= $scope.totalPages; i++) {
                pages.push(i);
            }
            return pages;
        };

        BookService.getBook($routeParams.id, function (data) {
            $scope.book = data;
        });

        function getBooks(page) {
            BookService.getBooks(page, function (data) {
                $scope.books = data.content;
                $scope.totalPages = data.totalPages;
            });
        }
    });