###有两个重要配置
1. web.xml中的dispacherServlet配置、过滤器的配置
    1、 这里主要在初始化时，将applicationContext尽心注册
    2、 主要还是拦截所有的客户端对select中reqest的请求，以统一管理
    3、 这里要求在服务器加载时一起启动
   
2. 还有就是Spring的配置设置。
    1、 主要是视图解析器需要设置，
    2、 就是对所有被拦截过来又找不到路径的请求抛回给tomcat去寻找
    3、 就是对controller的扫描，以此加载controller的bean