package com.picup.api.domains

class User {

    String username
    Boolean gettingStarted
    String languaje
    String email
    String encryptedPassword
    String resetPasswordToken
    Integer signInCount
    Date dateCreated //Magic names
    Date lastUpdated // too
    String authenticationToken
    String confirmEmailToken
    Date resetPasswordTokenSentAt
    Date confirmEmailTokenSentAt

    static hasOne = [profile:Profile]
    static hasMany = [photos:Photo]

    static mapping = {
        version false
    }

    static constraints = {
        //TODO : add constraints her
        email email: true
    }
}
