package com.api.mangaprogress.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.api.mangaprogress.dto.MangaDTO;
import com.api.mangaprogress.exception.MangaAlreadyRegisteredException;
import com.api.mangaprogress.exception.MangaNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Api("Manages mangas")
public interface MangaControllerDocs {

    @ApiOperation(value = "Manga creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success manga creation"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    MangaDTO createManga(MangaDTO mangaDTO) throws MangaAlreadyRegisteredException;

    @ApiOperation(value = "Returns manga found by a given name")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success manga found in the system"),
            @ApiResponse(code = 404, message = "Manga with given name not found.")
    })
    MangaDTO findByName(@PathVariable String name) throws MangaNotFoundException;

    @ApiOperation(value = "Returns a list of all mangas registered in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all mangas registered in the system"),
    })
    List<MangaDTO> listMangas();

    @ApiOperation(value = "Delete a manga found by a given valid Id")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success manga deleted in the system"),
            @ApiResponse(code = 404, message = "Manga with given id not found.")
    })
    void deleteById(@PathVariable Long id) throws MangaNotFoundException;
}
