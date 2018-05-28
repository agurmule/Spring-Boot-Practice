package com.devcol.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcol.model.Inventry;
import com.devcol.servise.InventryService;

@RestController
@RequestMapping("inventry")
public class InventryController {
	@Autowired
	InventryService inventryService;

	@RequestMapping(method = RequestMethod.GET, value = "/{firstname}")
	public Inventry get(@PathVariable String firstname) {
		return inventryService.search(firstname);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/all/{firstname}")
	public List<Inventry> getSearch(@PathVariable String firstname) {
		return inventryService.getAllBySearch(firstname);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/search/{inV1}/{inV2}")
	public List<Inventry> getSearch(@PathVariable int inV1,@PathVariable int inV2) {
		return inventryService.getAllByAND(inV1, inV2);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/between/{inV1}/{inV2}")
	public List<Inventry> getSearchBet(@PathVariable int inV1,@PathVariable int inV2) {
		return inventryService.getAllBetween(inV1, inV2);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/abc/{inV1}/{inV2}")
	public List<Inventry> getAllBetweenSearch(@PathVariable String inV1,@PathVariable int inV2) {
		return inventryService.getAllBetweenSearch(inV1, inV2);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public void post(@RequestBody Inventry inventry) {
		inventryService.addInventry(inventry);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "")
	public void put() {

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "")
	public void delete() {

	}

}
