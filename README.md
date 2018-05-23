# xss-filter-spring-boot-starter
springboot auto xss

使用方法
在项目的pom.xml中加入依赖即口

    <dependency>
            <groupId>com.djk</groupId>
            <artifactId>xss-filter-spring-boot-starter</artifactId>
            <version>0.0.1</version>
    </dependency>


目前支持3种入参数xss过滤

    @RequestMapping("/test1")
    public String test1(String name) {
        log.error("name:{}", name);
        return name;
    }
    
    

    @RequestMapping("/test2/{name}/{age}/{test}")
    public String test2(@PathVariable String name, @PathVariable int age, @PathVariable String test) {
        log.error("name:{}", name);
        log.error("age:{}", age);
        log.error("test:{}", test);

        return name;
    }
    


    @RequestMapping("/test3")
    public Params test3(@RequestBody Params params) {
        log.error("hello:{}", params);
        return params;
    }
