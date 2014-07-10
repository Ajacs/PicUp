package com.picup.api.domains

class Photo {

    String name
    String description
    String guid
    Boolean pending
    String remotePhotoPath
    String randomString
    Boolean processedImage
    Date dateCreated
    Date lastUpdated
    Boolean isPublic
    Integer commentCount

    static belongsTo = [user:User]

    static constraints = {
    }
}
