package com.tonyodev.fetch2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;
import androidx.compose.foundation.text.modifiers.l;
import androidx.fragment.app.C2564b;
import java.io.Serializable;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadNotification implements Parcelable, Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private Status status = Status.NONE;
    private int progress = -1;
    private int notificationId = -1;
    private int groupId = -1;
    private long etaInMilliSeconds = -1;
    private long downloadedBytesPerSecond = -1;
    private long total = -1;
    private long downloaded = -1;

    @NotNull
    private String namespace = Ib.b.f53007l;

    @NotNull
    private String title = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ActionType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType PAUSE = new ActionType("PAUSE", 0);
        public static final ActionType RESUME = new ActionType("RESUME", 1);
        public static final ActionType CANCEL = new ActionType("CANCEL", 2);
        public static final ActionType DELETE = new ActionType("DELETE", 3);
        public static final ActionType RETRY = new ActionType("RETRY", 4);
        public static final ActionType PAUSE_ALL = new ActionType("PAUSE_ALL", 5);
        public static final ActionType RESUME_ALL = new ActionType("RESUME_ALL", 6);
        public static final ActionType CANCEL_ALL = new ActionType("CANCEL_ALL", 7);
        public static final ActionType DELETE_ALL = new ActionType("DELETE_ALL", 8);
        public static final ActionType RETRY_ALL = new ActionType("RETRY_ALL", 9);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{PAUSE, RESUME, CANCEL, DELETE, RETRY, PAUSE_ALL, RESUME_ALL, CANCEL_ALL, DELETE_ALL, RETRY_ALL};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = kotlin.enums.c.c(actionTypeArr$values);
        }

        private ActionType(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public static final class a implements Parcelable.Creator<DownloadNotification> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DownloadNotification createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            Status statusA = Status.Companion.a(source.readInt());
            int i10 = source.readInt();
            int i11 = source.readInt();
            int i12 = source.readInt();
            long j10 = source.readLong();
            long j11 = source.readLong();
            long j12 = source.readLong();
            long j13 = source.readLong();
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            String string2 = source.readString();
            String str = string2 != null ? string2 : "";
            DownloadNotification downloadNotification = new DownloadNotification();
            downloadNotification.setStatus(statusA);
            downloadNotification.setProgress(i10);
            downloadNotification.setNotificationId(i11);
            downloadNotification.setGroupId(i12);
            downloadNotification.setEtaInMilliSeconds(j10);
            downloadNotification.setDownloadedBytesPerSecond(j11);
            downloadNotification.setTotal(j12);
            downloadNotification.setDownloaded(j13);
            downloadNotification.setNamespace(string);
            downloadNotification.setTitle(str);
            return downloadNotification;
        }

        @NotNull
        public DownloadNotification[] d(int i10) {
            return new DownloadNotification[i10];
        }

        @Override // android.os.Parcelable.Creator
        public DownloadNotification[] newArray(int i10) {
            return new DownloadNotification[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194356a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Status.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Status.COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f194356a = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.DownloadNotification");
        DownloadNotification downloadNotification = (DownloadNotification) obj;
        return this.status == downloadNotification.status && this.progress == downloadNotification.progress && this.notificationId == downloadNotification.notificationId && this.groupId == downloadNotification.groupId && this.etaInMilliSeconds == downloadNotification.etaInMilliSeconds && this.downloadedBytesPerSecond == downloadNotification.downloadedBytesPerSecond && this.total == downloadNotification.total && this.downloaded == downloadNotification.downloaded && G.g(this.namespace, downloadNotification.namespace) && G.g(this.title, downloadNotification.title);
    }

    public final long getDownloaded() {
        return this.downloaded;
    }

    public final long getDownloadedBytesPerSecond() {
        return this.downloadedBytesPerSecond;
    }

    public final long getEtaInMilliSeconds() {
        return this.etaInMilliSeconds;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean getProgressIndeterminate() {
        return this.total == -1;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.title.hashCode() + l.a(this.namespace, (C1550p.a(this.downloaded) + ((C1550p.a(this.total) + ((C1550p.a(this.downloadedBytesPerSecond) + ((C1550p.a(this.etaInMilliSeconds) + (((((((this.status.hashCode() * 31) + this.progress) * 31) + this.notificationId) * 31) + this.groupId) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final boolean isActive() {
        Status status = this.status;
        return status == Status.QUEUED || status == Status.DOWNLOADING;
    }

    public final boolean isCancelled() {
        return this.status == Status.CANCELLED;
    }

    public final boolean isCancelledNotification() {
        int i10 = b.f194356a[this.status.ordinal()];
        return i10 == 3 || i10 == 4 || i10 == 5;
    }

    public final boolean isCompleted() {
        return this.status == Status.COMPLETED;
    }

    public final boolean isDeleted() {
        return this.status == Status.DELETED;
    }

    public final boolean isDownloading() {
        return this.status == Status.DOWNLOADING;
    }

    public final boolean isFailed() {
        return this.status == Status.FAILED;
    }

    public final boolean isOnGoingNotification() {
        int i10 = b.f194356a[this.status.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final boolean isPaused() {
        return this.status == Status.PAUSED;
    }

    public final boolean isQueued() {
        return this.status == Status.QUEUED;
    }

    public final boolean isRemovableNotification() {
        int i10 = b.f194356a[this.status.ordinal()];
        return i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public final boolean isRemoved() {
        return this.status == Status.REMOVED;
    }

    public final void setDownloaded(long j10) {
        this.downloaded = j10;
    }

    public final void setDownloadedBytesPerSecond(long j10) {
        this.downloadedBytesPerSecond = j10;
    }

    public final void setEtaInMilliSeconds(long j10) {
        this.etaInMilliSeconds = j10;
    }

    public final void setGroupId(int i10) {
        this.groupId = i10;
    }

    public final void setNamespace(@NotNull String str) {
        G.p(str, "<set-?>");
        this.namespace = str;
    }

    public final void setNotificationId(int i10) {
        this.notificationId = i10;
    }

    public final void setProgress(int i10) {
        this.progress = i10;
    }

    public final void setStatus(@NotNull Status status) {
        G.p(status, "<set-?>");
        this.status = status;
    }

    public final void setTitle(@NotNull String str) {
        G.p(str, "<set-?>");
        this.title = str;
    }

    public final void setTotal(long j10) {
        this.total = j10;
    }

    @NotNull
    public String toString() {
        Status status = this.status;
        int i10 = this.progress;
        int i11 = this.notificationId;
        int i12 = this.groupId;
        long j10 = this.etaInMilliSeconds;
        long j11 = this.downloadedBytesPerSecond;
        long j12 = this.total;
        long j13 = this.downloaded;
        String str = this.namespace;
        String str2 = this.title;
        StringBuilder sb2 = new StringBuilder("DownloadNotification(status=");
        sb2.append(status);
        sb2.append(", progress=");
        sb2.append(i10);
        sb2.append(", notificationId=");
        androidx.viewpager.widget.a.a(sb2, i11, ", groupId=", i12, ", etaInMilliSeconds=");
        sb2.append(j10);
        C1713x0.a(sb2, ", downloadedBytesPerSecond=", j11, ", total=");
        sb2.append(j12);
        C1713x0.a(sb2, ", downloaded=", j13, ", namespace='");
        return C2564b.a(sb2, str, "', title='", str2, "')");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeInt(this.status.getValue());
        dest.writeInt(this.progress);
        dest.writeInt(this.notificationId);
        dest.writeInt(this.groupId);
        dest.writeLong(this.etaInMilliSeconds);
        dest.writeLong(this.downloadedBytesPerSecond);
        dest.writeLong(this.total);
        dest.writeLong(this.downloaded);
        dest.writeString(this.namespace);
        dest.writeString(this.title);
    }
}
