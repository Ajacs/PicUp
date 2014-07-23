'use strict'

###*
 # @ngdoc service
 # @name frontendApp.user
 # @description
 # # user
 # Service in the frontendApp.
###
angular.module('grouptionApp')
  .service 'User', ->

  	getAllUsers: ->
  		console.log('aqui generamos la consulta a nuestra API')
  	getUserByID: (userId) ->
  		console.log "This is the userId: #{userId}"
    # AngularJS will instantiate a singleton by calling "new" on this function
