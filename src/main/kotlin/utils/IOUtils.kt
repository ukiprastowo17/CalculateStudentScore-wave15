package utils

import java.lang.NumberFormatException

object IOUtils {
    fun readString(default: String = ""): String {
      return readLine() ?: default
    }

    fun readInt(default: Int = 0): Int {
        return try {
            readLine()?.toInt() ?: default
        } catch (e: NumberFormatException){
            default
        }
    }

    fun readDouble(default: Double = -1.0): Double {
        return try {
            readLine()?.toDouble() ?: default
        } catch (e: NumberFormatException){
            default
        }
    }
}