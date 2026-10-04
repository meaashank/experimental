package com.google.firebase.logger;

import android.util.Log;
import dd.k;
import dd.o;
import e.f0;
import ed.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.y;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,196:1\n26#2:197\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n*L\n78#1:197\n*E\n"})
public abstract class Logger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;

    @NotNull
    private Level minLevel;

    @NotNull
    private final String tag;

    @V({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public static final class AndroidLogger extends Logger {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            super(tag, z10, minLevel, null);
            G.p(tag, "tag");
            G.p(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
            G.p(level, "level");
            G.p(format, "format");
            G.p(args, "args");
            if (args.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i10 == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, format, th) : Log.v(tag, format);
            }
            if (i10 == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, format, th) : Log.d(tag2, format);
            }
            if (i10 == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, format, th) : Log.i(tag3, format);
            }
            if (i10 == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, format, th) : Log.w(tag4, format);
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, format, th) : Log.e(tag5, format);
        }
    }

    @V({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n73#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z10, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z10, level);
        }

        @o
        @NotNull
        public final Logger getLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            Object objPutIfAbsent;
            G.p(tag, "tag");
            G.p(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, z10, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            return (Logger) androidLogger;
        }

        @o
        @f0
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            G.p(tag, "tag");
            G.p(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, z10, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    @V({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1747#2,3:197\n1747#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    @f0
    public static final class FakeLogger extends Logger {

        @NotNull
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            super(tag, z10, minLevel, null);
            G.p(tag, "tag");
            G.p(minLevel, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                String str2 = level + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + ' ' + str;
        }

        @f0
        public final void clearLogMessages() {
            this.record.clear();
        }

        @f0
        public final boolean hasLogMessage(@NotNull String message) {
            G.p(message, "message");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (M.p3((String) it.next(), message, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f0
        public final boolean hasLogMessageThat(@NotNull l<? super String, Boolean> predicate) {
            G.p(predicate, "predicate");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
            G.p(level, "level");
            G.p(format, "format");
            G.p(args, "args");
            String logMessage = toLogMessage(level, format, args, th);
            System.out.println((Object) y.a("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i10) {
            this.priority = i10;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z10, Level level, C4969v c4969v) {
        this(str, z10, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    @o
    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return Companion.getLogger(str, z10, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority$com_google_firebase_firebase_common() <= level.getPriority$com_google_firebase_firebase_common() || Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common())) {
            return log(level, str, objArr, th);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i10 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    @o
    @f0
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return Companion.setupFakeLogger(str, z10, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    @k
    public final int debug(@NotNull String msg) {
        G.p(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    @k
    public final int error(@NotNull String msg) {
        G.p(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @k
    public final int info(@NotNull String msg) {
        G.p(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th);

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setMinLevel(@NotNull Level level) {
        G.p(level, "<set-?>");
        this.minLevel = level;
    }

    @k
    public final int verbose(@NotNull String msg) {
        G.p(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    @k
    public final int warn(@NotNull String msg) {
        G.p(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    private Logger(String str, boolean z10, Level level) {
        this.tag = str;
        this.enabled = z10;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    @k
    public final int debug(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    @k
    public final int error(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    @k
    public final int info(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    @k
    public final int verbose(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    @k
    public final int warn(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    @k
    public final int debug(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        G.p(format, "format");
        G.p(args, "args");
        return logIfAble(Level.DEBUG, format, args, th);
    }

    @k
    public final int error(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        G.p(format, "format");
        G.p(args, "args");
        return logIfAble(Level.ERROR, format, args, th);
    }

    @k
    public final int info(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        G.p(format, "format");
        G.p(args, "args");
        return logIfAble(Level.INFO, format, args, th);
    }

    @k
    public final int verbose(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        G.p(format, "format");
        G.p(args, "args");
        return logIfAble(Level.VERBOSE, format, args, th);
    }

    @k
    public final int warn(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        G.p(format, "format");
        G.p(args, "args");
        return logIfAble(Level.WARN, format, args, th);
    }

    @k
    public final int debug(@NotNull String msg, @Nullable Throwable th) {
        G.p(msg, "msg");
        return logIfAble$default(this, Level.DEBUG, msg, null, th, 4, null);
    }

    @k
    public final int error(@NotNull String msg, @Nullable Throwable th) {
        G.p(msg, "msg");
        return logIfAble$default(this, Level.ERROR, msg, null, th, 4, null);
    }

    @k
    public final int info(@NotNull String msg, @Nullable Throwable th) {
        G.p(msg, "msg");
        return logIfAble$default(this, Level.INFO, msg, null, th, 4, null);
    }

    @k
    public final int verbose(@NotNull String msg, @Nullable Throwable th) {
        G.p(msg, "msg");
        return logIfAble$default(this, Level.VERBOSE, msg, null, th, 4, null);
    }

    @k
    public final int warn(@NotNull String msg, @Nullable Throwable th) {
        G.p(msg, "msg");
        return logIfAble$default(this, Level.WARN, msg, null, th, 4, null);
    }
}
