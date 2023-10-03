//package com.omgproject.omg1.Model;
//
//import org.hibernate.HibernateException;
//import org.hibernate.MappingException;
//import org.hibernate.engine.spi.SharedSessionContractImplementor;
//import org.hibernate.id.enhanced.SequenceStyleGenerator;
//import org.hibernate.jpa.internal.util.ConfigurationHelper;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.type.Type;
//
//import java.util.Properties;
//
//public class StringPrefixedSequenceGenerator extends SequenceStyleGenerator {
//
//    public static final String VALUE_PREFIX_PARAMETER ="valueprefix";
//    public static final String VALUE_PREFIX_DEFAULT ="";
//    private String valuePrefix;
//
//    public static final String NUMBER_FORMAT_PARAMATER ="numberFormat";
//    public static final String NUMBER_FORMAT_DEFAULT="%d";
//    private String numberFormat;
//
////    VALUE_PREFIX_DEFAULT
////    NUMBER_FORMAT_PARAMETER
////        NUMBER_FORMAT_DEFAULT
//
//
//    @Override
//    public void configure(Type String, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
////
//        super.configure(String, params, serviceRegistry);
//        valuePrefix = java.lang.String.valueOf(ConfigurationHelper.getInteger(VALUE_PREFIX_PARAMETER));
//        valuePrefix = java.lang.String.valueOf(ConfigurationHelper.getInteger(VALUE_PREFIX_DEFAULT));
//        numberFormat = java.lang.String.valueOf(ConfigurationHelper.getInteger(NUMBER_FORMAT_PARAMATER));
//        numberFormat = java.lang.String.valueOf(ConfigurationHelper.getInteger(NUMBER_FORMAT_DEFAULT));
//
//
//    }
//
//    @Override
//    public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
////        return super.generate(session, object);
//        return valuePrefix + String.format(numberFormat,super.generate(session,object));
//    }
//}
