package com.prism.gaia.server.content;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class SyncStatusInfo implements Parcelable {
    private static final int MAX_EVENT_COUNT = 10;
    static final int VERSION = 4;
    public final int authorityId;
    public long initialFailureTime;
    public boolean initialize;
    public String lastFailureMesg;
    public int lastFailureSource;
    public long lastFailureTime;
    public int lastSuccessSource;
    public long lastSuccessTime;
    private final ArrayList<Long> mLastEventTimes;
    private final ArrayList<String> mLastEvents;
    public int numSourceLocal;
    public int numSourcePeriodic;
    public int numSourcePoll;
    public int numSourceServer;
    public int numSourceUser;
    public int numSyncs;
    public boolean pending;
    private ArrayList<Long> periodicSyncTimes;
    public long totalElapsedTime;
    private static final String TAG = "asdf-".concat("SyncStatusInfo");
    public static final Parcelable.Creator<SyncStatusInfo> CREATOR = new a();

    public class a implements Parcelable.Creator<SyncStatusInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SyncStatusInfo createFromParcel(Parcel parcel) {
            return new SyncStatusInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SyncStatusInfo[] newArray(int i10) {
            return new SyncStatusInfo[i10];
        }
    }

    public SyncStatusInfo(int i10) {
        this.mLastEventTimes = new ArrayList<>();
        this.mLastEvents = new ArrayList<>();
        this.authorityId = i10;
    }

    private void ensurePeriodicSyncTimeSize(int i10) {
        if (this.periodicSyncTimes == null) {
            this.periodicSyncTimes = new ArrayList<>(0);
        }
        int i11 = i10 + 1;
        if (this.periodicSyncTimes.size() < i11) {
            for (int size = this.periodicSyncTimes.size(); size < i11; size++) {
                this.periodicSyncTimes.add(0L);
            }
        }
    }

    public void addEvent(String str) {
        if (this.mLastEventTimes.size() >= 10) {
            this.mLastEventTimes.remove(9);
            this.mLastEvents.remove(9);
        }
        this.mLastEventTimes.add(0, Long.valueOf(System.currentTimeMillis()));
        this.mLastEvents.add(0, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEvent(int i10) {
        return this.mLastEvents.get(i10);
    }

    public int getEventCount() {
        return this.mLastEventTimes.size();
    }

    public long getEventTime(int i10) {
        return this.mLastEventTimes.get(i10).longValue();
    }

    public long getPeriodicSyncTime(int i10) {
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList == null || i10 >= arrayList.size()) {
            return 0L;
        }
        return this.periodicSyncTimes.get(i10).longValue();
    }

    public void removePeriodicSyncTime(int i10) {
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList == null || i10 >= arrayList.size()) {
            return;
        }
        this.periodicSyncTimes.remove(i10);
    }

    public void setPeriodicSyncTime(int i10, long j10) {
        ensurePeriodicSyncTimeSize(i10);
        this.periodicSyncTimes.set(i10, Long.valueOf(j10));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(4);
        parcel.writeInt(this.authorityId);
        parcel.writeLong(this.totalElapsedTime);
        parcel.writeInt(this.numSyncs);
        parcel.writeInt(this.numSourcePoll);
        parcel.writeInt(this.numSourceServer);
        parcel.writeInt(this.numSourceLocal);
        parcel.writeInt(this.numSourceUser);
        parcel.writeLong(this.lastSuccessTime);
        parcel.writeInt(this.lastSuccessSource);
        parcel.writeLong(this.lastFailureTime);
        parcel.writeInt(this.lastFailureSource);
        parcel.writeString(this.lastFailureMesg);
        parcel.writeLong(this.initialFailureTime);
        parcel.writeInt(this.pending ? 1 : 0);
        parcel.writeInt(this.initialize ? 1 : 0);
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList != null) {
            parcel.writeInt(arrayList.size());
            ArrayList<Long> arrayList2 = this.periodicSyncTimes;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Long l10 = arrayList2.get(i11);
                i11++;
                parcel.writeLong(l10.longValue());
            }
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.mLastEventTimes.size());
        for (int i12 = 0; i12 < this.mLastEventTimes.size(); i12++) {
            parcel.writeLong(this.mLastEventTimes.get(i12).longValue());
            parcel.writeString(this.mLastEvents.get(i12));
        }
        parcel.writeInt(this.numSourcePeriodic);
    }

    public SyncStatusInfo(Parcel parcel) {
        this.mLastEventTimes = new ArrayList<>();
        this.mLastEvents = new ArrayList<>();
        int i10 = parcel.readInt();
        this.authorityId = parcel.readInt();
        this.totalElapsedTime = parcel.readLong();
        this.numSyncs = parcel.readInt();
        this.numSourcePoll = parcel.readInt();
        this.numSourceServer = parcel.readInt();
        this.numSourceLocal = parcel.readInt();
        this.numSourceUser = parcel.readInt();
        this.lastSuccessTime = parcel.readLong();
        this.lastSuccessSource = parcel.readInt();
        this.lastFailureTime = parcel.readLong();
        this.lastFailureSource = parcel.readInt();
        this.lastFailureMesg = parcel.readString();
        this.initialFailureTime = parcel.readLong();
        this.pending = parcel.readInt() != 0;
        this.initialize = parcel.readInt() != 0;
        if (i10 == 1) {
            this.periodicSyncTimes = null;
        } else {
            int i11 = parcel.readInt();
            if (i11 < 0) {
                this.periodicSyncTimes = null;
            } else {
                this.periodicSyncTimes = new ArrayList<>();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.periodicSyncTimes.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (i10 >= 3) {
                this.mLastEventTimes.clear();
                this.mLastEvents.clear();
                int i13 = parcel.readInt();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.mLastEventTimes.add(Long.valueOf(parcel.readLong()));
                    this.mLastEvents.add(parcel.readString());
                }
            }
        }
        if (i10 < 4) {
            int i15 = (((this.numSyncs - this.numSourceLocal) - this.numSourcePoll) - this.numSourceServer) - this.numSourceUser;
            this.numSourcePeriodic = i15;
            if (i15 < 0) {
                this.numSourcePeriodic = 0;
                return;
            }
            return;
        }
        this.numSourcePeriodic = parcel.readInt();
    }

    public SyncStatusInfo(SyncStatusInfo syncStatusInfo) {
        ArrayList<Long> arrayList = new ArrayList<>();
        this.mLastEventTimes = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mLastEvents = arrayList2;
        this.authorityId = syncStatusInfo.authorityId;
        this.totalElapsedTime = syncStatusInfo.totalElapsedTime;
        this.numSyncs = syncStatusInfo.numSyncs;
        this.numSourcePoll = syncStatusInfo.numSourcePoll;
        this.numSourceServer = syncStatusInfo.numSourceServer;
        this.numSourceLocal = syncStatusInfo.numSourceLocal;
        this.numSourceUser = syncStatusInfo.numSourceUser;
        this.numSourcePeriodic = syncStatusInfo.numSourcePeriodic;
        this.lastSuccessTime = syncStatusInfo.lastSuccessTime;
        this.lastSuccessSource = syncStatusInfo.lastSuccessSource;
        this.lastFailureTime = syncStatusInfo.lastFailureTime;
        this.lastFailureSource = syncStatusInfo.lastFailureSource;
        this.lastFailureMesg = syncStatusInfo.lastFailureMesg;
        this.initialFailureTime = syncStatusInfo.initialFailureTime;
        this.pending = syncStatusInfo.pending;
        this.initialize = syncStatusInfo.initialize;
        if (syncStatusInfo.periodicSyncTimes != null) {
            this.periodicSyncTimes = new ArrayList<>(syncStatusInfo.periodicSyncTimes);
        }
        arrayList.addAll(syncStatusInfo.mLastEventTimes);
        arrayList2.addAll(syncStatusInfo.mLastEvents);
    }
}
