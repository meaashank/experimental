package net.i2p.android.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import net.i2p.android.lib.helper.R;
import net.i2p.android.router.service.IRouterState;
import net.i2p.android.router.service.State;

/* JADX INFO: loaded from: classes5.dex */
public class I2PAndroidHelper {
    private static final String LOG_TAG = "I2PHelperLib";
    public static final int REQUEST_START_I2P = 9857;
    private static final String ROUTER_SERVICE_CLASS = "net.i2p.android.router.service.RouterService";
    public static final String URI_I2P_ANDROID = "net.i2p.android";
    public static final String URI_I2P_ANDROID_DEBUG = "net.i2p.android.debug";
    public static final String URI_I2P_ANDROID_DONATE = "net.i2p.android.donate";
    public static final String URI_I2P_ANDROID_LEGACY = "net.i2p.android.router";
    private Callback mCallback;
    private final Context mContext;
    private final ServiceConnection mStateConnection;
    private IRouterState mStateService;
    private boolean mTriedBindState;
    private final boolean mUseDebug;

    public interface Callback {
        void onI2PAndroidBound();
    }

    public I2PAndroidHelper(Context context) {
        this.mStateConnection = new ServiceConnection() { // from class: net.i2p.android.ui.I2PAndroidHelper.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                I2PAndroidHelper.this.mStateService = IRouterState.Stub.asInterface(iBinder);
                Log.i(I2PAndroidHelper.LOG_TAG, "Bound to I2P Android");
                if (I2PAndroidHelper.this.mCallback != null) {
                    I2PAndroidHelper.this.mCallback.onI2PAndroidBound();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w(I2PAndroidHelper.LOG_TAG, "I2P Android disconnected unexpectedly");
                I2PAndroidHelper.this.mStateService = null;
            }
        };
        this.mContext = context;
        this.mUseDebug = false;
    }

    private Intent getI2PAndroidIntent() {
        Intent intent = new Intent("net.i2p.android.router.service.IRouterState");
        if (isAppInstalled(URI_I2P_ANDROID)) {
            intent.setClassName(URI_I2P_ANDROID, ROUTER_SERVICE_CLASS);
        } else if (isAppInstalled(URI_I2P_ANDROID_DONATE)) {
            intent.setClassName(URI_I2P_ANDROID_DONATE, ROUTER_SERVICE_CLASS);
        } else if (isAppInstalled(URI_I2P_ANDROID_LEGACY)) {
            intent.setClassName(URI_I2P_ANDROID_LEGACY, ROUTER_SERVICE_CLASS);
        } else {
            intent = null;
        }
        if (this.mUseDebug && isAppInstalled(URI_I2P_ANDROID_DEBUG)) {
            Log.w(LOG_TAG, "Using debug build of I2P Android");
            intent.setClassName(URI_I2P_ANDROID_DEBUG, ROUTER_SERVICE_CLASS);
        }
        return intent;
    }

    private boolean isAppInstalled(String str) {
        try {
            this.mContext.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean areTunnelsActive() {
        IRouterState iRouterState = this.mStateService;
        if (iRouterState == null) {
            return false;
        }
        try {
            return iRouterState.getState() == State.ACTIVE;
        } catch (RemoteException e10) {
            Log.w(LOG_TAG, "Failed to communicate with I2P Android", e10);
            return false;
        }
    }

    public void bind(Callback callback) {
        this.mCallback = callback;
        bind();
    }

    public boolean isI2PAndroidInstalled() {
        return (this.mUseDebug && isAppInstalled(URI_I2P_ANDROID_DEBUG)) || isAppInstalled(URI_I2P_ANDROID) || isAppInstalled(URI_I2P_ANDROID_DONATE) || isAppInstalled(URI_I2P_ANDROID_LEGACY);
    }

    public boolean isI2PAndroidRunning() {
        IRouterState iRouterState = this.mStateService;
        if (iRouterState == null) {
            return false;
        }
        try {
            return iRouterState.isStarted();
        } catch (RemoteException e10) {
            Log.w(LOG_TAG, "Failed to communicate with I2P Android", e10);
            return false;
        }
    }

    public void promptToInstall(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.install_i2p_android).setMessage(R.string.you_must_have_i2p_android).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: net.i2p.android.ui.I2PAndroidHelper.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(activity.getString(R.string.market_i2p_android))));
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: net.i2p.android.ui.I2PAndroidHelper.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
            }
        });
        builder.show();
    }

    public void requestI2PAndroidStart(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.start_i2p_android).setMessage(R.string.would_you_like_to_start_i2p_android).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: net.i2p.android.ui.I2PAndroidHelper.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                activity.startActivityForResult(new Intent("net.i2p.android.router.START_I2P"), I2PAndroidHelper.REQUEST_START_I2P);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: net.i2p.android.ui.I2PAndroidHelper.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
            }
        });
        builder.show();
    }

    public void unbind() {
        if (this.mTriedBindState) {
            this.mContext.unbindService(this.mStateConnection);
        }
        this.mTriedBindState = false;
        this.mCallback = null;
    }

    public void bind() {
        Log.i(LOG_TAG, "Binding to I2P Android");
        Intent i2PAndroidIntent = getI2PAndroidIntent();
        if (i2PAndroidIntent != null) {
            Log.i(LOG_TAG, i2PAndroidIntent.toString());
            try {
                boolean zBindService = this.mContext.bindService(i2PAndroidIntent, this.mStateConnection, 1);
                this.mTriedBindState = zBindService;
                if (zBindService) {
                    return;
                }
                Log.w(LOG_TAG, "Could not bind: bindService failed");
                return;
            } catch (SecurityException unused) {
                this.mStateService = null;
                this.mTriedBindState = false;
                Log.w(LOG_TAG, "Could not bind: I2P Android version is too old");
                return;
            }
        }
        Log.w(LOG_TAG, "Could not bind: I2P Android not installed");
    }

    public I2PAndroidHelper(Context context, boolean z10) {
        this.mStateConnection = new ServiceConnection() { // from class: net.i2p.android.ui.I2PAndroidHelper.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                I2PAndroidHelper.this.mStateService = IRouterState.Stub.asInterface(iBinder);
                Log.i(I2PAndroidHelper.LOG_TAG, "Bound to I2P Android");
                if (I2PAndroidHelper.this.mCallback != null) {
                    I2PAndroidHelper.this.mCallback.onI2PAndroidBound();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w(I2PAndroidHelper.LOG_TAG, "I2P Android disconnected unexpectedly");
                I2PAndroidHelper.this.mStateService = null;
            }
        };
        this.mContext = context;
        this.mUseDebug = z10;
    }

    public boolean bind(ServiceConnection serviceConnection, int i10) {
        Log.i(LOG_TAG, "Binding to I2P Android with provided ServiceConnection");
        Intent i2PAndroidIntent = getI2PAndroidIntent();
        if (i2PAndroidIntent != null) {
            Log.i(LOG_TAG, i2PAndroidIntent.toString());
            try {
                boolean zBindService = this.mContext.bindService(i2PAndroidIntent, serviceConnection, i10);
                if (!zBindService) {
                    Log.w(LOG_TAG, "Could not bind: bindService failed");
                }
                return zBindService;
            } catch (SecurityException unused) {
                Log.w(LOG_TAG, "Could not bind: I2P Android version is too old");
                return false;
            }
        }
        Log.w(LOG_TAG, "Could not bind: I2P Android not installed");
        return false;
    }
}
