package n7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;
import c7.x;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {
    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new G("adjustVolume"));
        f(new G("adjustLocalOrRemoteStreamVolume"));
        f(new G("adjustSuggestedStreamVolume"));
        f(new G("adjustStreamVolume"));
        f(new G("adjustMasterVolume"));
        f(new G("setMasterMute"));
        f(new G("setStreamVolume"));
        f(new G("setMasterVolume"));
        f(new G("setMicrophoneMute"));
        f(new G("setRingerModeExternal"));
        f(new G("setRingerModeInternal"));
        f(new G("setMode"));
        f(new G("avrcpSupportsAbsoluteVolume"));
        f(new G("abandonAudioFocus"));
        f(new G("requestAudioFocus"));
        f(new G("setWiredDeviceConnectionState"));
        f(new G("setSpeakerphoneOn"));
        f(new G("setBluetoothScoOn"));
        f(new G("stopBluetoothSco"));
        f(new G("startBluetoothSco"));
        f(new G("disableSafeMediaVolume"));
        f(new G("registerRemoteControlClient"));
        f(new G("unregisterAudioFocusClient"));
    }
}
