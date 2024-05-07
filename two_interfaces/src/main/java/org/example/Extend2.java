package org.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Extend2 implements  Inter{
    @Override
    public void do_sink(String arg) {
        final ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("js");
        try {
            scriptEngine.eval(arg);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
