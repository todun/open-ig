/*
 * Copyright 2008-2012, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.mechanics;

import java.util.List;

import hu.openig.model.AIManager;
import hu.openig.model.BattleInfo;
import hu.openig.model.Building;
import hu.openig.model.DiplomaticInteraction;
import hu.openig.model.Fleet;
import hu.openig.model.Planet;
import hu.openig.model.Player;
import hu.openig.model.ResearchType;
import hu.openig.model.ResponseMode;
import hu.openig.model.SpacewarAction;
import hu.openig.model.SpacewarStructure;
import hu.openig.model.SpacewarWorld;
import hu.openig.model.World;
import hu.openig.utils.XElement;

/**
 * AI for pirate attacks.
 * @author akarnokd, 2011.12.08.
 */
public class AIPirate implements AIManager {
	
	@Override
	public void init(World w, Player p) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResponseMode diplomacy(World world, Player we, Player other,
			DiplomaticInteraction offer) {
		// No diplomatic options
		return ResponseMode.NO;
	}

	@Override
	public SpacewarAction spaceBattle(SpacewarWorld world, Player player,
			List<SpacewarStructure> idles) {
		for (SpacewarStructure s : idles) {
			AI.defaultAttackBehavior(world, s);
		}
		return SpacewarAction.CONTINUE;
	}

	@Override
	public void groundBattle(World world, Player we, BattleInfo battle) {
		// No ground battle
	}

	@Override
	public void load(XElement in) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void save(XElement out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onResearchComplete(ResearchType rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProductionComplete(ResearchType rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDiscoverPlanet(Planet planet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDiscoverFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDiscoverPlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFleetArrivedAtPoint(Fleet fleet, double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFleetArrivedAtPlanet(Fleet fleet, Planet planet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFleetArrivedAtFleet(Fleet fleet, Fleet other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBuildingComplete(Planet planet, Building building) {
		// TODO Auto-generated method stub
		
	}
	
}