package com.example.codeeditor.others
// M2P company question
fun main() {
    val logs =
        "id=101, name=Alice Smith, username=asmith, email=alice@example.com;id=102, name=Bob Johnson, username=bjohnson, email=bob@example.com;id=103, name=Charlie Lee, username=clee, email=charlie@example.com;id=104, name=Alice Smith, username=asmith, email=alice2@example.com;id=105, name=Emily Davis, username=edavis, email=emily@example.com;id=106, name=Frank Moore, username=fmoore, email=frank@example.com;id=107, name=Charlie Lee, username=clee, email=charlie2@example.com;id=108, name=Grace Kim, username=gkim, email=grace@example.com;id=109, name=Bob Johnson, username=bjohnson, email=bob2@example.com;id=110, name=Hannah Scott, username=hscott, email=hannah@example.com"

    val result = cleanLogs(logs)
    print(result)
}

fun cleanLogs(logs: String): String {
    var logs1 = ""
    val usernames = mutableListOf<String>()

    logs.split(";").forEach { log: String ->
        val logList = log.split(",")
        if (logList[2] !in usernames) {
            usernames.add(logList[2])
            val lastIndex = logList.lastIndex
            logList.forEachIndexed { index, item ->
                if (!item.contains("id=")) {
                    logs1 = if (index != lastIndex)
                        "$logs1$item,"
                    else
                        "$logs1$item"
                }
            }
            logs1 = "$logs1;"
        }
    }
    return logs1
}
