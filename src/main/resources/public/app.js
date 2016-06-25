'use strict';

angular
    .module('BookishApp', [
        'ngRoute'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'views/index.html',
                controller: 'bookController'
            })
            .when('/books/:id', {
                templateUrl: 'views/bookDetail.html',
                controller: 'bookController'
            })
            .otherwise({
                redirectTo: '/'
            });
    });
