/*
 * silvertunnel.org Netlib - Java library to easily access anonymity networks
 * Copyright (c) 2009-2012 silvertunnel.org
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see <http://www.gnu.org/licenses/>.
 */

package org.silvertunnel_ng.netlib.layer.tor.api;

import java.net.InetAddress;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.Set;

import org.silvertunnel_ng.netlib.layer.tor.directory.RouterFlags;

/**
 * a compound data structure that keeps track of the static informations we have
 * about a single Tor server.
 * 
 * @author hapke
 */
public interface Router
{
	String getNickname();

	String getHostname();

	InetAddress getAddress();

	String getCountryCode();

	int getOrPort();

	int getSocksPort();

	int getDirPort();

	int getBandwidthAvg();

	int getBandwidthBurst();

	int getBandwidthObserved();

	String getPlatform();

	long getPublished();

	Fingerprint getFingerprint();

	int getUptime();

	RSAPublicKey getOnionKey();

	RSAPublicKey getSigningKey();

	String getContact();

	Set<Fingerprint> getFamily();

	long getValidUntil();

	long getLastUpdate();

	boolean isDirv2Authority();

	boolean isDirv2Exit();

	boolean isDirv2Fast();

	boolean isDirv2Guard();

	boolean isDirv2Named();

	boolean isDirv2Stable();

	boolean isDirv2Running();

	boolean isDirv2Valid();

	boolean isDirv2V2dir();
	
	boolean isExitNode();
	
	/**
	 * Get the routerflags of a router (stable, valid, fast, etc).
	 * @return a {@link RouterFlags} object
	 */
	RouterFlags getRouterFlags();

	float getRankingIndex();
}
