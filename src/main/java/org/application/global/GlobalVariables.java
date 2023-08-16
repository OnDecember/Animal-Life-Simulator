package org.application.global;

import java.util.concurrent.locks.ReentrantLock;

public class GlobalVariables {

    public static final ReentrantLock lock = new ReentrantLock();
}
