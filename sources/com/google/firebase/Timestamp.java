package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.C1477d;
import androidx.collection.Q;
import dd.o;
import e.T;
import java.time.Instant;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @dd.g
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp[] newArray(int i10) {
            return new Timestamp[i10];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> toPreciseTime(Date date) {
            long j10 = 1000;
            long time = date.getTime() / j10;
            int time2 = (int) ((date.getTime() % j10) * ((long) 1000000));
            return time2 < 0 ? new Pair<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new Pair<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j10, int i10) {
            if (i10 < 0 || i10 >= 1000000000) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("Timestamp nanoseconds out of range: ", i10).toString());
            }
            if (-62135596800L > j10 || j10 >= 253402300800L) {
                throw new IllegalArgumentException(Q.a("Timestamp seconds out of range: ", j10).toString());
            }
        }

        @o
        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j10, int i10) {
        Companion.validateRange(j10, i10);
        this.seconds = j10;
        this.nanoseconds = i10;
    }

    @o
    @NotNull
    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return (((((int) j10) * 1369) + ((int) (j10 >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    @T(26)
    @NotNull
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        G.o(instantOfEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantOfEpochSecond;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.seconds);
        sb2.append(", nanoseconds=");
        return C1477d.a(sb2, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp other) {
        G.p(other, "other");
        return Oc.g.o(this, other, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
            @Nullable
            public Object get(@Nullable Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Timestamp(@NotNull Date date) {
        G.p(date, "date");
        Companion companion = Companion;
        Pair preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.f217467a).longValue();
        int iIntValue = ((Number) preciseTime.f217468b).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @T(26)
    public Timestamp(@NotNull Instant time) {
        this(time.getEpochSecond(), time.getNano());
        G.p(time, "time");
    }
}
