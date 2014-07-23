'use strict'

###*
 # @ngdoc function
 # @name frontendApp.controller:UserCtrl
 # @description
 # # UserCtrl
 # Controller of the frontendApp
###
angular.module('grouptionApp')
  .controller 'UserController', ($scope,userService) ->
    listUsers: ->
    	try
    		# ...
    		userService.getAllUsers()
    	catch e
    		# ...
    		console.log "Unable to get getAllUsers method response: #{e}"
    	
    	userService.getAllUsers()
    $scope.usuarios = 'HOLAAAA MUNDOOOOOO'
