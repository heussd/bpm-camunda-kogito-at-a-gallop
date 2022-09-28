package com.example.hello

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Service

@Service("ideaReceiver")
class IdeaReceiver : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        println(
            "🎉 🚀 ✅ Your idea \"${execution.variables["idea"]}\" has been approved!"
        )
    }
}