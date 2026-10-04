package com.prism.gaia.remote;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAG;

/* JADX INFO: loaded from: classes6.dex */
public class PendingResultData implements Parcelable {
    public static final int TYPE_COMPONENT = 0;
    public static final int TYPE_REGISTERED = 1;
    public static final int TYPE_UNREGISTERED = 2;
    public boolean mAbortBroadcast;
    public boolean mFinished;
    public int mFlags;
    public boolean mInitialStickyHint;
    public boolean mOrderedHint;
    public int mResultCode;
    public String mResultData;
    public Bundle mResultExtras;
    public int mSendingUser;
    public IBinder mToken;
    public int mType;
    private static final String TAG = "asdf-".concat("PendingResultData");
    public static final Parcelable.Creator<PendingResultData> CREATOR = new a();

    public class a implements Parcelable.Creator<PendingResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PendingResultData createFromParcel(Parcel parcel) {
            return new PendingResultData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PendingResultData[] newArray(int i10) {
            return new PendingResultData[i10];
        }
    }

    public PendingResultData(int i10, String str, Bundle bundle, int i11, boolean z10, boolean z11, IBinder iBinder, int i12, int i13) {
        this.mResultCode = i10;
        this.mResultData = str;
        this.mResultExtras = bundle;
        this.mType = i11;
        this.mOrderedHint = z10;
        this.mInitialStickyHint = z11;
        this.mToken = iBinder;
        this.mSendingUser = i12;
        this.mFlags = i13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BroadcastReceiver.PendingResult fetchPendingResult() {
        return BroadcastReceiverCAG.CM23.PendingResult.ctor() != null ? BroadcastReceiverCAG.CM23.PendingResult.ctor().newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken, Integer.valueOf(this.mSendingUser), Integer.valueOf(this.mFlags)) : BroadcastReceiverCAG.CJ17.PendingResult.ctor() != null ? BroadcastReceiverCAG.CJ17.PendingResult.ctor().newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken, Integer.valueOf(this.mSendingUser)) : BroadcastReceiverCAG.f165589C.PendingResult.ctor().newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken);
    }

    public void finish() {
        try {
            fetchPendingResult().finish();
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.mType);
        parcel.writeByte(this.mOrderedHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mInitialStickyHint ? (byte) 1 : (byte) 0);
        parcel.writeStrongBinder(this.mToken);
        parcel.writeInt(this.mSendingUser);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mResultCode);
        parcel.writeString(this.mResultData);
        parcel.writeBundle(this.mResultExtras);
        parcel.writeByte(this.mAbortBroadcast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mFinished ? (byte) 1 : (byte) 0);
    }

    public PendingResultData(BroadcastReceiver.PendingResult pendingResult) {
        if (BroadcastReceiverCAG.CM23.PendingResult.ctor() != null) {
            this.mType = BroadcastReceiverCAG.CM23.PendingResult.mType().get(pendingResult);
            this.mOrderedHint = BroadcastReceiverCAG.CM23.PendingResult.mOrderedHint().get(pendingResult);
            this.mInitialStickyHint = BroadcastReceiverCAG.CM23.PendingResult.mInitialStickyHint().get(pendingResult);
            this.mToken = BroadcastReceiverCAG.CM23.PendingResult.mToken().get(pendingResult);
            this.mSendingUser = BroadcastReceiverCAG.CM23.PendingResult.mSendingUser().get(pendingResult);
            this.mFlags = BroadcastReceiverCAG.CM23.PendingResult.mFlags().get(pendingResult);
            this.mResultCode = BroadcastReceiverCAG.CM23.PendingResult.mResultCode().get(pendingResult);
            this.mResultData = BroadcastReceiverCAG.CM23.PendingResult.mResultData().get(pendingResult);
            this.mResultExtras = BroadcastReceiverCAG.CM23.PendingResult.mResultExtras().get(pendingResult);
            this.mAbortBroadcast = BroadcastReceiverCAG.CM23.PendingResult.mAbortBroadcast().get(pendingResult);
            this.mFinished = BroadcastReceiverCAG.CM23.PendingResult.mFinished().get(pendingResult);
            return;
        }
        if (BroadcastReceiverCAG.CJ17.PendingResult.ctor() != null) {
            this.mType = BroadcastReceiverCAG.CJ17.PendingResult.mType().get(pendingResult);
            this.mOrderedHint = BroadcastReceiverCAG.CJ17.PendingResult.mOrderedHint().get(pendingResult);
            this.mInitialStickyHint = BroadcastReceiverCAG.CJ17.PendingResult.mInitialStickyHint().get(pendingResult);
            this.mToken = BroadcastReceiverCAG.CJ17.PendingResult.mToken().get(pendingResult);
            this.mSendingUser = BroadcastReceiverCAG.CJ17.PendingResult.mSendingUser().get(pendingResult);
            this.mResultCode = BroadcastReceiverCAG.CJ17.PendingResult.mResultCode().get(pendingResult);
            this.mResultData = BroadcastReceiverCAG.CJ17.PendingResult.mResultData().get(pendingResult);
            this.mResultExtras = BroadcastReceiverCAG.CJ17.PendingResult.mResultExtras().get(pendingResult);
            this.mAbortBroadcast = BroadcastReceiverCAG.CJ17.PendingResult.mAbortBroadcast().get(pendingResult);
            this.mFinished = BroadcastReceiverCAG.CJ17.PendingResult.mFinished().get(pendingResult);
            return;
        }
        this.mType = BroadcastReceiverCAG.f165589C.PendingResult.mType().get(pendingResult);
        this.mOrderedHint = BroadcastReceiverCAG.f165589C.PendingResult.mOrderedHint().get(pendingResult);
        this.mInitialStickyHint = BroadcastReceiverCAG.f165589C.PendingResult.mInitialStickyHint().get(pendingResult);
        this.mToken = BroadcastReceiverCAG.f165589C.PendingResult.mToken().get(pendingResult);
        this.mResultCode = BroadcastReceiverCAG.f165589C.PendingResult.mResultCode().get(pendingResult);
        this.mResultData = BroadcastReceiverCAG.f165589C.PendingResult.mResultData().get(pendingResult);
        this.mResultExtras = BroadcastReceiverCAG.f165589C.PendingResult.mResultExtras().get(pendingResult);
        this.mAbortBroadcast = BroadcastReceiverCAG.f165589C.PendingResult.mAbortBroadcast().get(pendingResult);
        this.mFinished = BroadcastReceiverCAG.f165589C.PendingResult.mFinished().get(pendingResult);
    }

    public PendingResultData(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
    }
}
