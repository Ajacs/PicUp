'use strict'

###*
 # @ngdoc function
 # @name frontendApp.controller:AboutCtrl
 # @description
 # # AboutCtrl
 # Controller of the frontendApp
###
angular.module('grouptionApp')
  .controller 'AboutCtrl', ($scope) ->
    $scope.awesomeThings = [
      'HTML5 Boilerplate'
      'AngularJS'
      'Karma'
    ]
