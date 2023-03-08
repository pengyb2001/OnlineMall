package com.zhang.ssmschoolshop.annotinon;

/**
 * @author group
 * @description
 * @date 2021/4/11 11:21
 */

import java.lang.annotation.*;

/**
 * @Classname ExportEntityMap
 * @Description
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExportEntityMap {

    String EnName() default "数据库列名";

    String CnName() default "实体映射名";

}