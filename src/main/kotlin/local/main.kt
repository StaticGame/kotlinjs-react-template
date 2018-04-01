package local

import react.dom.div
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    render(document.getElementById("root")) {
        div { +"Hello, Kotlin React Build" }
    }
}