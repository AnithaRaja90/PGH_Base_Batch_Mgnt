package com.niche.jhipster.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.niche.jhipster.service.NurseryService;
import com.niche.jhipster.web.rest.errors.BadRequestAlertException;
import com.niche.jhipster.web.rest.util.HeaderUtil;
import com.niche.jhipster.web.rest.util.PaginationUtil;
import com.niche.jhipster.service.dto.NurseryDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Nursery.
 */
@RestController
@RequestMapping("/api")
public class NurseryResource {

    private final Logger log = LoggerFactory.getLogger(NurseryResource.class);

    private static final String ENTITY_NAME = "nursery";

    private final NurseryService nurseryService;

    public NurseryResource(NurseryService nurseryService) {
        this.nurseryService = nurseryService;
    }

    /**
     * POST  /nurseries : Create a new nursery.
     *
     * @param nurseryDTO the nurseryDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new nurseryDTO, or with status 400 (Bad Request) if the nursery has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/nurseries")
    @Timed
    public ResponseEntity<NurseryDTO> createNursery(@Valid @RequestBody NurseryDTO nurseryDTO) throws URISyntaxException {
        log.debug("REST request to save Nursery : {}", nurseryDTO);
        if (nurseryDTO.getId() != null) {
            throw new BadRequestAlertException("A new nursery cannot already have an ID", ENTITY_NAME, "idexists");
        }
        NurseryDTO result = nurseryService.save(nurseryDTO);
        return ResponseEntity.created(new URI("/api/nurseries/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /nurseries : Updates an existing nursery.
     *
     * @param nurseryDTO the nurseryDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated nurseryDTO,
     * or with status 400 (Bad Request) if the nurseryDTO is not valid,
     * or with status 500 (Internal Server Error) if the nurseryDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/nurseries")
    @Timed
    public ResponseEntity<NurseryDTO> updateNursery(@Valid @RequestBody NurseryDTO nurseryDTO) throws URISyntaxException {
        log.debug("REST request to update Nursery : {}", nurseryDTO);
        if (nurseryDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        NurseryDTO result = nurseryService.save(nurseryDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, nurseryDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /nurseries : get all the nurseries.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of nurseries in body
     */
    @GetMapping("/nurseries")
    @Timed
    public ResponseEntity<List<NurseryDTO>> getAllNurseries(Pageable pageable) {
        log.debug("REST request to get a page of Nurseries");
        Page<NurseryDTO> page = nurseryService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/nurseries");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /nurseries/:id : get the "id" nursery.
     *
     * @param id the id of the nurseryDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the nurseryDTO, or with status 404 (Not Found)
     */
    @GetMapping("/nurseries/{id}")
    @Timed
    public ResponseEntity<NurseryDTO> getNursery(@PathVariable Long id) {
        log.debug("REST request to get Nursery : {}", id);
        Optional<NurseryDTO> nurseryDTO = nurseryService.findOne(id);
        return ResponseUtil.wrapOrNotFound(nurseryDTO);
    }

    /**
     * DELETE  /nurseries/:id : delete the "id" nursery.
     *
     * @param id the id of the nurseryDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/nurseries/{id}")
    @Timed
    public ResponseEntity<Void> deleteNursery(@PathVariable Long id) {
        log.debug("REST request to delete Nursery : {}", id);
        nurseryService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
