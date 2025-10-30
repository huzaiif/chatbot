package com.example.humblebot1.model

data class GeminiResponse(
    val candidates: List<Candidate>
)

data class Candidate(
    val content: Content
)