package com.android.launcher3.compat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.ArrayMap;
import com.android.launcher3.util.LongArrayMap;
import com.prism.commons.utils.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UserManagerCompatVL extends UserManagerCompat {
    private static final String TAG = l0.b("UserManagerCompatVL");
    private static final String USER_CREATION_TIME_KEY = "user_creation_time_";
    private final Context mContext;
    private final PackageManager mPm;
    protected final UserManager mUserManager;
    protected ArrayMap<UserHandle, Long> mUserToSerialMap;
    protected LongArrayMap<UserHandle> mUsers;

    public UserManagerCompatVL(Context context) {
        this.mUserManager = (UserManager) context.getSystemService("user");
        this.mPm = context.getPackageManager();
        this.mContext = context;
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public void enableAndResetCache() {
        synchronized (this) {
            try {
                this.mUsers = new LongArrayMap<>();
                this.mUserToSerialMap = new ArrayMap<>();
                List<UserHandle> userProfiles = this.mUserManager.getUserProfiles();
                if (userProfiles != null) {
                    for (UserHandle userHandle : userProfiles) {
                        long serialNumberForUser = this.mUserManager.getSerialNumberForUser(userHandle);
                        this.mUsers.put(serialNumberForUser, userHandle);
                        this.mUserToSerialMap.put(userHandle, Long.valueOf(serialNumberForUser));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public CharSequence getBadgedLabelForUser(CharSequence charSequence, UserHandle userHandle) {
        if (userHandle == null) {
            return charSequence;
        }
        try {
            return this.mPm.getUserBadgedLabel(charSequence, userHandle);
        } catch (Exception e10) {
            e10.getMessage();
            return charSequence;
        }
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public long getSerialNumberForUser(UserHandle userHandle) {
        synchronized (this) {
            try {
                ArrayMap<UserHandle, Long> arrayMap = this.mUserToSerialMap;
                if (arrayMap == null) {
                    return this.mUserManager.getSerialNumberForUser(userHandle);
                }
                Long l10 = arrayMap.get(userHandle);
                return l10 == null ? 0L : l10.longValue();
            } finally {
            }
        }
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public UserHandle getUserForSerialNumber(long j10) {
        synchronized (this) {
            try {
                LongArrayMap<UserHandle> longArrayMap = this.mUsers;
                if (longArrayMap == null) {
                    return this.mUserManager.getUserForSerialNumber(j10);
                }
                return longArrayMap.get(j10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public List<UserHandle> getUserProfiles() {
        synchronized (this) {
            try {
                if (this.mUsers != null) {
                    return new ArrayList(this.mUserToSerialMap.keySet());
                }
                List<UserHandle> userProfiles = this.mUserManager.getUserProfiles();
                return userProfiles == null ? Collections.EMPTY_LIST : userProfiles;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public boolean isAnyProfileQuietModeEnabled() {
        return false;
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public boolean isDemoUser() {
        return false;
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public boolean isQuietModeEnabled(UserHandle userHandle) {
        return false;
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public boolean isUserUnlocked(UserHandle userHandle) {
        return true;
    }

    @Override // com.android.launcher3.compat.UserManagerCompat
    public boolean requestQuietModeEnabled(boolean z10, UserHandle userHandle) {
        return false;
    }
}
