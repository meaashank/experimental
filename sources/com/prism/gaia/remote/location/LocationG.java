package com.prism.gaia.remote.location;

import a7.g;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C1571b;
import com.prism.gaia.helper.utils.y;

/* JADX INFO: loaded from: classes6.dex */
public class LocationG implements Parcelable {
    public static final Parcelable.Creator<LocationG> CREATOR = new a();
    public float accuracy;
    public double altitude;
    public float bearing;
    public double latitude;
    public double longitude;
    public float speed;

    public class a implements Parcelable.Creator<LocationG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LocationG createFromParcel(Parcel parcel) {
            return new LocationG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public LocationG[] newArray(int i10) {
            return new LocationG[i10];
        }
    }

    public LocationG() {
        this.latitude = 0.0d;
        this.longitude = 0.0d;
        this.altitude = 0.0d;
        this.accuracy = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isEmpty() {
        return this.latitude == 0.0d && this.longitude == 0.0d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VLocation{latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", altitude=");
        sb2.append(this.altitude);
        sb2.append(", accuracy=");
        sb2.append(this.accuracy);
        sb2.append(", speed=");
        sb2.append(this.speed);
        sb2.append(", bearing=");
        return C1571b.a(sb2, this.bearing, '}');
    }

    public Location toSysLocation() {
        Location location = new Location("gps");
        location.setAccuracy(8.0f);
        Bundle bundle = new Bundle();
        location.setBearing(this.bearing);
        new y(location).f("setIsFromMockProvider", Boolean.FALSE);
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        location.setSpeed(this.speed);
        location.setTime(System.currentTimeMillis());
        location.setExtras(bundle);
        location.setElapsedRealtimeNanos(277000000L);
        int i10 = g.a().i();
        bundle.putInt("satellites", i10);
        bundle.putInt("satellitesvalue", i10);
        return location;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
        parcel.writeFloat(this.accuracy);
        parcel.writeFloat(this.speed);
        parcel.writeFloat(this.bearing);
    }

    public LocationG(Parcel parcel) {
        this.latitude = 0.0d;
        this.longitude = 0.0d;
        this.altitude = 0.0d;
        this.accuracy = 0.0f;
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.altitude = parcel.readDouble();
        this.accuracy = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.bearing = parcel.readFloat();
    }
}
