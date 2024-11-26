package com.gsxy.core.pojo.enums;

public class Log4jEnum {

    public static final String TRACE = "TRACE";//最细粒度的信息，通常只在开发过程中使用，用于跟踪程序的执行路径。
    public static final String DEBUG = "DEBUG";//调试信息，记录程序运行时的内部状态和变量值。
    public static final String INFO = "INFO";//一般信息，记录系统的关键运行状态和业务流程。
    public static final String WARN = "WARN";//警告信息，表示可能存在潜在问题，但系统仍可继续运行。表示出现了影响系统功能的问题，需要及时处理。
    public static final String ERROR = "ERROR";//误信息，FATAL:致命错误，表示系统可能无法继续运行，需要立即关注。


}
