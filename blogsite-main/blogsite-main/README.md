# The Long Take — Bootstrap Refactor

A three-page blog site (Home, About Us, Contact Us) refactored with Bootstrap 5, built to match the lab's rubric.

## What's inside

- `index.html` — homepage: Bootstrap navbar, a 3-column grid (`col-lg-3 / col-lg-6 / col-lg-3`) with the middle column carrying the featured + recent posts, and a full-width footer row.
- `about.html` — same navbar/grid/footer system, middle column holds the "why this project exists" content.
- `contact.html` — same system, middle column holds a working form (email + message) with a **Send message** button. Submitting shows a dismissible Bootstrap alert confirming the message was sent, without reloading the page.
- `css/styles.css` — all custom styling: color palette, typography (Fraunces + Inter from Google Fonts), and layout tweaks on top of Bootstrap.
- `js/script.js` — handles the contact form submit and injects the live, dismissible alert.

Bootstrap and its JS bundle are loaded via CDN (`https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/...`) in every page's `<head>`/before `</body>`, satisfying Task 1.

## Before you submit

1. **Swap in your real team names** — search each HTML file for `TODO: replace with your group's real names` (footer, all three pages) and replace the three placeholder list items.
2. **Swap the contact details** in the footer and Contact page if your group wants a different email/phone shown.
3. **Check the homepage/About/Contact copy** against your instructor's wireframe — the grid structure (3-col row + footer row) matches the brief described in the rubric, but re-check spacing/column widths against your specific wireframe image and adjust the `col-lg-*` classes if it calls for different proportions.
4. **Push to your team's existing GitHub repo** from the earlier Blog Site project (don't create a new repo) — copy these files in, replacing the old ones, and commit.
5. **Test the Contact page** in a browser: submit the form with both fields filled to confirm the alert appears and can be dismissed with the × button.

## Local preview

No build step is needed — just open `index.html` in a browser, or serve the folder locally:

```bash
python3 -m http.server 8000
```

Then visit `http://localhost:8000`.
