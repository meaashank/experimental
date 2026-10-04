package com.cookiegames.smartcookie;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceCapabilities {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DeviceCapabilities[] $VALUES;
    public static final DeviceCapabilities FULL_INCOGNITO = new DeviceCapabilities("FULL_INCOGNITO", 0);
    public static final DeviceCapabilities WEB_RTC = new DeviceCapabilities("WEB_RTC", 1);
    public static final DeviceCapabilities THIRD_PARTY_COOKIE_BLOCKING = new DeviceCapabilities("THIRD_PARTY_COOKIE_BLOCKING", 2);

    private static final /* synthetic */ DeviceCapabilities[] $values() {
        return new DeviceCapabilities[]{FULL_INCOGNITO, WEB_RTC, THIRD_PARTY_COOKIE_BLOCKING};
    }

    static {
        DeviceCapabilities[] deviceCapabilitiesArr$values = $values();
        $VALUES = deviceCapabilitiesArr$values;
        $ENTRIES = kotlin.enums.c.c(deviceCapabilitiesArr$values);
    }

    private DeviceCapabilities(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<DeviceCapabilities> getEntries() {
        return $ENTRIES;
    }

    public static DeviceCapabilities valueOf(String str) {
        return (DeviceCapabilities) Enum.valueOf(DeviceCapabilities.class, str);
    }

    public static DeviceCapabilities[] values() {
        return (DeviceCapabilities[]) $VALUES.clone();
    }
}
