package com.thoughtworks.basic.Exception;

public class FlagRepeatException extends RuntimeException {
    public FlagRepeatException() {
        super("当前输入flag有重复");
    }
}
