dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/picup?useUnicode=yes&characterEncoding=UTF-8"
            username = "picupgrails"
            password = "ajauregui"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/picup?useUnicode=yes&characterEncoding=UTF-8"
            username = "picupgrails"
            password = "ajauregui"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/picup?useUnicode=yes&characterEncoding=UTF-8"
            username = "picupgrails"
            password = "ajauregui"
        }
    }
}