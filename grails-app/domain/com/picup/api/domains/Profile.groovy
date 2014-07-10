package com.picup.api.domains

class Profile {

    String firstName
    String lastName
    String imageUrl
    String imageUrlSmall
    String imageUrlMedium
    Date birthday
    char gender
    String biography
    Date dateCreated
    Date lastUpdated
    String location
    String fullName
    User user

    static mapping = {
        version false
    }

    static constraints = {
        // TODO : add constraints her
    }
}
