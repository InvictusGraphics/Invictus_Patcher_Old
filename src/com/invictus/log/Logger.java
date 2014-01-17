package com.invictus.log;

import com.invictus.Main;

public class Logger {

	public static void logDebug(String message) {
		if (LogLevel.DEBUG.compareTo(Main.LOGLEVEL) >= 0)
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.DEBUG+"]: "+message);
	}

	public static void logInfo(String message) {
		if (LogLevel.INFO.compareTo(Main.LOGLEVEL) >= 0)
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.INFO+"]: "+message);
	}

	public static void logWarn(String message) {
		if (LogLevel.WARN.compareTo(Main.LOGLEVEL) >= 0)
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.WARN+"]: "+message);
	}

	public static void logError(String message) {
		if (LogLevel.ERROR.compareTo(Main.LOGLEVEL) >= 0)
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.ERROR+"]: "+message);
	}

	public static void logDebug(String message, Throwable t) {
		if (LogLevel.DEBUG.compareTo(Main.LOGLEVEL) >= 0) {
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.DEBUG+"]: "+message);
			System.out.println(t);
		}
	}

	public static void logInfo(String message, Throwable t) {
		if (LogLevel.INFO.compareTo(Main.LOGLEVEL) >= 0) {
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.INFO+"]: "+message);
			System.out.println(t);
		}
	}

	public static void logWarn(String message, Throwable t) {
		if (LogLevel.WARN.compareTo(Main.LOGLEVEL) >= 0) {
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.WARN+"]: "+message);
			System.out.println(t);
		}
	}

	public static void logError(String message, Throwable t) {
		if (LogLevel.ERROR.compareTo(Main.LOGLEVEL) >= 0) {
			System.out.println("[IP v"+Main.VERSION+"]["+LogLevel.ERROR+"]: "+message);
			System.out.println(t);
		}
	}
}
