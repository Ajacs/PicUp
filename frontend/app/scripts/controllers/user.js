// Generated by CoffeeScript 1.7.1
'use strict';

/**
  * @ngdoc function
  * @name frontendApp.controller:UserCtrl
  * @description
  * # UserCtrl
  * Controller of the frontendApp
 */
angular.module('grouptionApp').controller('UserController', function($scope, userService) {
  ({
    listUsers: function() {
      var e;
      try {
        userService.getAllUsers();
      } catch (_error) {
        e = _error;
        console.log("Unable to get getAllUsers method response: " + e);
      }
      return userService.getAllUsers();
    }
  });
  return $scope.usuarios = 'HOLAAAA MUNDOOOOOO';
});
