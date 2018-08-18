package local

import kotlinx.css.*
import react.dom.div
import react.dom.render
import styled.StyleSheet
import styled.css
import styled.styledDiv
import kotlin.browser.document

object MainDivStyles : StyleSheet("MainDiv", isStatic = true) {
    val wrapper by css {
        textAlign = TextAlign.center
        backgroundColor = Color("#CED9E0")
        fontSize = 1.6.rem
        fontWeight = FontWeight.w800
    }
}

fun main(args: Array<String>) {
    render(document.getElementById("root")) {
        styledDiv {
            css {
                +MainDivStyles.wrapper
            }
            +"Hello, Kotlin React Build"
        }
    }
}