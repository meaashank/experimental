package com.google.gson;

/* JADX INFO: loaded from: classes5.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l10) {
            return new JsonPrimitive((Number) l10);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l10) {
            return new JsonPrimitive(String.valueOf(l10));
        }
    };

    public abstract JsonElement serialize(Long l10);
}
