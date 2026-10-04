package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import e.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class LifecycleCallback {

    @NonNull
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @I
    @KeepForSdk
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @NonNull
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @I
    @KeepForSdk
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
    }

    @I
    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
    }

    @I
    @KeepForSdk
    public void onDestroy() {
    }

    @I
    @KeepForSdk
    public void onResume() {
    }

    @I
    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @I
    @KeepForSdk
    public void onStart() {
    }

    @I
    @KeepForSdk
    public void onStop() {
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zza()) {
            return zzd.zza(lifecycleActivity.zzd());
        }
        if (lifecycleActivity.zzb()) {
            return zza.zza(lifecycleActivity.zzc());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
