package com.afs.tdd;

import java.util.Arrays;

/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description
 */
public class Request {

    private Command command;


    public Request(Command command) {
        this.command = command;
    }


    public void executeCommand() {
        command.execute();
    }
}
