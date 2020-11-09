package com.projet.voiture.controller;

import com.projet.voiture.repository.AdresseRepository;
import com.projet.voiture.model.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdresseController {
    @Autowired
    AdresseRepository adresseRepo;

    @GetMapping("/api/adresse")
    //@ResponseBody
    public List<Adresse> getAll() {
        return adresseRepo.getAllAdresse();
    }

    /*@PostMapping(value = "/api/notes", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Adresse newNote(@RequestBody String payload) {
        int added = 0;
        int updatedID = 0;
        Adresse rs;

        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(payload);
            JSONObject jsonObject = (JSONObject) object;
            // If 'id' in JSON payload is not null, get me the true int value of 'id' or set it to 0
            int i = jsonObject.get("id") != null ? Double.valueOf(jsonObject.get("id").toString()).intValue() : 0;
            String body = (String) jsonObject.get("body");
            // If 'id' is greater than zero, we are updating an existing note
            if (i > 0) {
                updatedID = i;
                noteRepo.updateNote(i, body);
                // If 'id' is 0 we are adding a new note
            } else {
                added = noteRepo.addNote(body);
            }
        } catch (Exception e) {
            return new Notes(null, "The note id " + updatedID + " does not exist.");
        }
        if (added == 0) {
            System.out.println("added:" + added);
            System.out.println("id:" + updatedID);
            rs = noteRepo.getNote(updatedID);
        } else {
            rs = noteRepo.lastNote();
        }
        return new Notes(rs.getId(), rs.getBody());

    }

    @GetMapping("/api/notes/{id}")
    public Notes getNoteById(@PathVariable(value = "id") int noteId) {
        try {
            return noteRepo.getNote(noteId);
        } catch (Exception e) {
            return new Notes(null, "The note id " + noteId + " does not exist.");
        }

    }

    /**
     * This is hacky, but when you delete a note, the list of notes is returned whether it succeeds or fails
     * Technically, frontend could check for length to identify/resolve an error in deletion (non-existing note)
     * Orginally I was returning a string here with success or error - but thats not very REST-y
     */
    /*@PostMapping("/api/notes/delete")
    @ResponseBody
    public List<Notes> deleteItem(@RequestParam("id") int itemId) {

        try {
            if (noteRepo.deleteItem(itemId) >= 1) {
                return noteRepo.getAllNotes();
            }
        } catch (Exception e) {
            return noteRepo.getAllNotes();
        }

        return noteRepo.getAllNotes();
    }*/

}
