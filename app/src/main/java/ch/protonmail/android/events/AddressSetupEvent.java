/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ch.protonmail.android.api.models.address.AddressSetupResponse;

public class AddressSetupEvent {
    private final @NonNull AuthStatus status;
    private final @Nullable AddressSetupResponse response;

    public AddressSetupEvent(final @NonNull AuthStatus status, final @Nullable AddressSetupResponse response) {
        this.status = status;
        this.response = response;
    }

    @NonNull
    public AuthStatus getStatus() {
        return status;
    }

    @Nullable
    public AddressSetupResponse getResponse() {
        return response;
    }
}
