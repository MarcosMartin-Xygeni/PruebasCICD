<!--
The following configuration shows using RunAsManager to add the role "UBER_BOSS" to a user who has the role "ROLE_PEON",
thus temporarily granting this user manager privileges, which enables him to get data from PrivateCatalog service.
-->
<bean id="bankManagerSecurity" class="org.acegisecurity.intercept.method.aopalliance.MethodSecurityInterceptor">
  ...
  <property name="objectDefinitionSource">
    <value>
      com.example.service.PrivateCatalog.getData=ROLE_PEON,RUN_AS_UBER_BOSS
      ...
    </value>
  </property>
</bean>