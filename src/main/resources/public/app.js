'use strict';

angular
    .module('BookishApp', [
        'ngRoute'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'views/index.html'
            })
            .otherwise({
                redirectTo: '/'
            });
    });
