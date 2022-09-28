package org.kie.kogito.examples

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class IdeaReceiver {

    fun receive(idea: Idea) {
        println(
            "🎉 🚀 ✅ Your idea \"${idea}\" has been approved!"
        )
    }
}