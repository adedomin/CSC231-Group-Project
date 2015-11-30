package edu.easternct.csc231.nationalparks.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.easternct.csc231.nationalparks.models.Visitor;

/**
 * CRUD repo for all visitor objects
 *
 * @author Anthony DeDominic
 */
public interface VisitorRepo extends MongoRepository<Visitor, String> {

	public List<Visitor> findAllByParkId(String id);

	public Visitor findById(String id);
}
