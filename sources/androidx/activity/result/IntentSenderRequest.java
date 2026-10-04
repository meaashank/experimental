package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @Nullable
    private final Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;

    @NotNull
    private final IntentSender intentSender;

    @NotNull
    public static final b Companion = new b();

    @dd.g
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    public static final class Builder {

        @Nullable
        private Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;

        @NotNull
        private final IntentSender intentSender;

        @Lc.c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public Builder(@NotNull IntentSender intentSender) {
            G.p(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        @NotNull
        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        @NotNull
        public final Builder setFillInIntent(@Nullable Intent intent) {
            this.fillInIntent = intent;
            return this;
        }

        @NotNull
        public final Builder setFlags(int i10, int i11) {
            this.flagsValues = i10;
            this.flagsMask = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(@NotNull PendingIntent pendingIntent) {
            G.p(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            G.o(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(@NotNull Parcel inParcel) {
            G.p(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @NotNull
        public IntentSenderRequest[] d(int i10) {
            return new IntentSenderRequest[i10];
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public static final class b {
        public b() {
        }

        public static /* synthetic */ void a() {
        }

        public b(C4969v c4969v) {
        }
    }

    public IntentSenderRequest(@NotNull IntentSender intentSender, @Nullable Intent intent, int i10, int i11) {
        G.p(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i10;
        this.flagsValues = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    @NotNull
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeParcelable(this.intentSender, i10);
        dest.writeParcelable(this.fillInIntent, i10);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, C4969v c4969v) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@NotNull Parcel parcel) {
        G.p(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        G.m(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
