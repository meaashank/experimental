package net.i2p.android.router.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public enum State implements Parcelable {
    INIT,
    WAITING,
    STARTING,
    RUNNING,
    ACTIVE,
    STOPPING,
    STOPPED,
    MANUAL_STOPPING,
    MANUAL_STOPPED,
    MANUAL_QUITTING,
    MANUAL_QUITTED,
    NETWORK_STOPPING,
    NETWORK_STOPPED,
    GRACEFUL_SHUTDOWN;

    public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: net.i2p.android.router.service.State.1
        @Override // android.os.Parcelable.Creator
        public State createFromParcel(Parcel parcel) {
            try {
                String string = parcel.readString();
                if (string != null) {
                    return State.valueOf(string);
                }
                Log.e("I2P", "Received null from State Parcel.");
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public State[] newArray(int i10) {
            return new State[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
